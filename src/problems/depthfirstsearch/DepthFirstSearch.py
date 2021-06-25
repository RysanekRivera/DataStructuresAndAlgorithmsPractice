class Node:
    def __init__(self, name):
        self.children = []
        self.name = name

    def addChildren(self, name):
        self.children.append(Node(name))

    # O(vertices + edges) | O(v) space
    def depthFirstSearch(self, array):
        array.append(self.name)
        for child in self.children:
            child.depthFirstSearch(array)

        return array
