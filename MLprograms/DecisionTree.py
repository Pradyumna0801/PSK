#Practical 3
from sklearn import tree
from sklearn.model_selection import train_test_split
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

PlayTennis = pd.read_csv("dtdata.csv")

y = PlayTennis['play']
X = PlayTennis.drop(['play'],axis=1)

clf = tree.DecisionTreeClassifier(criterion ='entropy')
clf.fit(X,y)

fig, axes = plt.subplots(nrows = 1, ncols = 1, figsize = (20,20),dpi = 300)
tree.plot_tree(clf)
fig.savefig('dt1.png')
