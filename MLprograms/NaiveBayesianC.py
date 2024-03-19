#Practical 7
from sklearn.datasets import make_classification
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.naive_bayes import GaussianNB
from sklearn.metrics import (
    accuracy_score,
    confusion_matrix,
    ConfusionMatrixDisplay,
    f1_score,
)

# Generating data
X, y = make_classification(
    n_features=6,
    n_classes=3,
    n_samples=800,
    n_informative=2,
    random_state=1,
    n_clusters_per_class=1,
)

# Plotting the data
plt.scatter(X[:, 0], X[:, 1], c=y, marker="*")
plt.show()

# Splitting data into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.33, random_state=125
)

# Training Gaussian Naive Bayes model
model = GaussianNB()
model.fit(X_train, y_train)

# Making prediction on a single sample
predicted = model.predict([X_test[6]])

print("Actual value:", y_test[6])
print("Predicted value:", predicted[0])

# Evaluating model performance
y_pred = model.predict(X_test)
accuracy = accuracy_score(y_pred, y_test)
f1 = f1_score(y_test, y_pred, average="weighted")

print("Accuracy:", accuracy)
print("F1 Score:", f1)

