# Practical 5
class HashTable:
    def __init__(self):
        self.size = 10
        self.table = [None] * self.size

    def _hash_function(self, key):
        return hash(key) % self.size

    def insert(self, key, value):
        index = self._hash_function(key)
        self.table[index] = value

    def search(self, key):
        index = self._hash_function(key)
        return self.table[index]

    def delete(self, key):
        index = self._hash_function(key)
        self.table[index] = None

# Example usage:
if __name__ == "__main__":
    hash_table = HashTable()
    
    # Insert key-value pairs
    hash_table.insert("apple", 10)
    hash_table.insert("banana", 20)
    
    # Search for a key
    print(hash_table.search("apple"))  # Output: 10
    print(hash_table.search("grapes")) # Output: None
    
    # Delete a key
    hash_table.delete("banana")
    print(hash_table.search("banana")) # Output: None

