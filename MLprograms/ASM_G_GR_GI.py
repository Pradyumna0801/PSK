#Practical 4
import numpy as np
from collections import Counter

def entropy(labels):
    counts = np.bincount(labels)
    probabilities = counts / len(labels)
    entropy_value = -np.sum([p * np.log2(p) for p in probabilities if p > 0])
    return entropy_value

def information_gain(parent, left_child, right_child):
    num_total = len(left_child) + len(right_child)
    weight_left = len(left_child) / num_total
    weight_right = len(right_child) / num_total
    return parent - (weight_left * entropy(left_child) + weight_right * entropy(right_child))

def gain_ratio(parent, left_child, right_child):
    gain = information_gain(parent, left_child, right_child)
    split_entropy = entropy(left_child) * len(left_child) / len(parent) + entropy(right_child) * len(right_child) / len(parent)
    if split_entropy == 0:
        return 0
    return gain / split_entropy

def gini_index(labels):
    counts = Counter(labels)
    probabilities = [count / len(labels) for count in counts.values()]
    gini = 1 - sum(p ** 2 for p in probabilities)
    return gini

# Example usage:
# Suppose you have a dataset with labels and split them into left_child and right_child
labels = [1, 1, 1, 0, 0, 0]
left_child = [1, 1, 0]
right_child = [1, 0, 0]

parent_entropy = entropy(labels)
print("Parent entropy:", parent_entropy)

ig = information_gain(labels, left_child, right_child)
print("Information gain:", ig)

gr = gain_ratio(labels, left_child, right_child)
print("Gain ratio:", gr)

gi = gini_index(labels)
print("Gini index:", gi)


