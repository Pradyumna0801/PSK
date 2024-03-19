#Practical 11
import numpy as np
import skfuzzy as fuzz

np.random.seed()
data = np.random.rand(100, 2)

n_clusters = 3

cntr, u, u0, d, jm, p, fpc = fuzz.cluster.cmeans(data.T, n_clusters, 2, error=0.005, maxiter=1000, init=None)

cluster_membership = np.argmax(u, axis=0)

print('Cluster Centers:', cntr)

print('Cluster Membership:', cluster_membership)
