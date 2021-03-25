#include <iostream>
#include "node.cpp"

int main(int argc, char const *argv[])
{
    Node<int>* head = new Node<int>();
    Node<int>* second = new Node<int>();
    Node<int>* third = new Node<int>();

    head->data = 1;
    head->next = second;

    second->data = 2;
    second->next = third;

    third->data = 3;
    third->next = NULL;

    head->print_ll();

    delete head;
    delete second;
    delete third;

    return 0;
}
