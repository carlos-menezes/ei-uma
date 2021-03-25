#include <iostream>

template <typename T>
class Node
{
    public:
        T data;
        Node* next;

        Node();
        Node(T data, Node* next);
        void print_tree();
        ~Node();
};

template <typename T>
Node<T>::Node()
{

}

template <typename T>
Node<T>::Node(T d, Node* n)
{
    data = d;
    next = n;
}

template <typename T>
void Node<T>::print_tree() {
    Node* temp = this;
    while (temp != NULL) {
        std::cout << "Value at memory location " << temp << ": " << temp->data << std::endl;
        temp = temp->next;
    }
}