#Practical 5
import numpy as np

class KNN:
    def __init__(self, k=3):
        self.k = k

    def fit(self, X_train, y_train):
        self.X_train = X_train
        self.y_train = y_train

    def predict(self, X_test):
        predictions = [self._predict(x) for x in X_test]
        return np.array(predictions)

    def _predict(self, x):
        distances = [np.linalg.norm(x - x_train) for x_train in self.X_train]
        k_indices = np.argsort(distances)[:self.k]
        k_nearest_labels = [self.y_train[i] for i in k_indices]
        most_common = np.argmax(np.bincount(k_nearest_labels))
        return most_common

# Example usage:
# Create some sample data
X_train = np.array([[1, 2], [1.5, 1.8], [5, 8], [8, 8], [1, 0.6], [9, 11]])
y_train = np.array([0, 0, 1, 1, 0, 1])

X_test = np.array([[1, 3], [8, 9], [0, 3], [5, 4]])

# Instantiate KNN classifier
clf = KNN(k=2)
clf.fit(X_train, y_train)

# Predict the labels of the test data
predictions = clf.predict(X_test)
print("Predictions:", predictions)

