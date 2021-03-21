#include <iostream>
#include "vectorsOp.h"

using namespace std;

int main(){
    const int NUM_ELEMENTS = 50;
    int v[NUM_ELEMENTS];
    cout << "Quantos elementos quer inserir no vector? (max. " << NUM_ELEMENTS << ") ";
    int size;
    cin >> size;
    if (size > 0 && size <= NUM_ELEMENTS){
        bool exit = false;
        int option;
        do
        {
            cout << "\nEscolha uma opcao:\n";
            cout << "1 - Inserir Dados" << endl;
            cout << "2 - Visualizar Dados" << endl;
            cout << "3 - Somar" << endl;
            cout << "4 - Calcular Media" << endl;
            cout << "5 - Inverter" << endl;
            cout << "0 - Sair" << endl;
            cin >> option;
            cout << endl;
            switch (option) {
                case 1:
                    cout << "Escolheu a opcao Inserir Dados" << endl;
                    break;
                case 2:
                    cout << "Escolheu a opcao Visualizar Dados" << endl;
                    break;
                case 3:
                    cout << "Escolheu a opcao Somar" << endl;
                    break;
                case 4:
                    cout << "Escolheu a opcao Calcular Media" << endl;
                case 5:
                    cout << "Escolheu a opcao Inverter" << endl;
                    break;
                case 0:
                    cout << "Escolheu a opcao Sair. Adeus!" << endl;
                    exit = true;
                    break;
                default:
                    cout << "Escolha uma opcao valida." << endl;
            }
        } while (!exit);
    }
    else
        cout << "Inseriu numero de elementos invalido. Prima ENTER para terminar." << endl;
    cin.ignore();
    cin.get();
    return 0;
}