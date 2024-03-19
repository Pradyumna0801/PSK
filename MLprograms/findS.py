#Practial 1
import pandas as pd
import numpy as np

#read data
data = pd.read_csv("data.csv")
print(data,"n")

#making array 
d = np.array(data)[:,:-1]
print("\nThe attributes are:",d)

#segragating target that has positive and negative
target = np.array(data)[:,-1]
print("\nThe target is:",target)

#training function to implement find -s algo
def train(c,t):
    for i, val in enumerate(t):
        if val == "Yes":
            sh = c[i].copy()
            break
        
    for i,val in enumerate(c):
        if t[i] == "Yes":
            for x in range(len(sh)):
                if val[x] != sh[x]:
                    sh[x] = '?'
                else:
                    pass
    return sh

print("\nThe final hypothesis is:", train(d, target))