#Practical 9
import numpy as np
class SimpleLinearRegression:
    def fit(self, X, y):
        self.X = np.c_[np.ones(X.shape[0]), X] 
        self.y = y.reshape(-1, 1)
        self.coeff = np.linalg.inv(self.X.T @ self.X) @ self.X.T @ self.y
        self.y_pred = self.X @ self.coeff
        self.residuals = self.y - self.y_pred
        self.sse = np.sum(self.residuals ** 2)
        self.sst = np.sum((self.y - np.mean(self.y)) ** 2)
        self.r2 = 1 - self.sse / self.sst
        self.adj_r2 = 1 - (1 - self.r2) * (self.X.shape[0] - 1) / (self.X.shape[0] - self.X.shape[1] - 1)

# Example usage:
np.random.seed(0)
X = 2 * np.random.rand(100, 1)
y = 4 + 3 * X + np.random.randn(100, 1)

model = SimpleLinearRegression()
model.fit(X, y)

print("Coefficients:", model.coeff.flatten())
print("SSE:", model.sse)
print("SST:", model.sst)
print("R-squared:", model.r2)
print("Adjusted R-squared:", model.adj_r2)
