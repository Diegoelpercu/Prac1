package Dades;

public interface TADLlistaDE<T> {



    /**
     * Funció per tal d’inserir un element al final de la llista
     * @param data
     */
    void Inserir (T data);


    /**
     * Funció per tal d’inserir un element a la llista en la posició indicada
     * L’operació llença una excepció en cas que no es pugui realitzar l’operació.
     * @param posició
     * @param data
     */
    void Inserir(int posició, T data);


    /**
     * Funció que retorna l’element que hi ha en una determinada posició.
     * L’operació llença una excepció en cas que no es pugui obtenir 
     * @param posició
     * @return elem 
     */
    T Obtenir(int posició);


    /**
     * Retorna el nombre d’elements que conté la llista en aquest moment
     * @return nElem 
     */
    int Longitud();


    /**
     * Funció per tal d’esborrar un element de la llista en una posició determinada
     * L’operació llença una excepció en cas que no es pugui eliminar
     *  @param posició
     */
    void Esborrar(int posició);


    /**
     * Funció que comprova si un element està a la llista.
     * La funció retorna el cost de l’operació. 
       Nombre d’elements que s’hagin accedit per tal de comprovar si l’element existeix o no.
     * L’operació llença una excepció en cas que l’element no s’hagi trobat. La mateixa 
        excepció contindrà informació del nombre d’elements que s’han accedit per
        comprovar si l’element buscat existeix o no.
     * @param data
     * @return cost (nElem)
     */
    int Buscar(T data);
}
