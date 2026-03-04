package pila;

import java.util.ArrayList;
import java.util.EmptyStackException;

// La magia sucede con <T> después del nombre de la clase.
// T es ahora un "parámetro de tipo".
public class Pila<T> {

    private ArrayList<T> elementos;

    public Pila() {
        // El array interno también contendrá elementos del tipo T.
        this.elementos = new ArrayList<>();
    }

    // El método push ahora solo acepta elementos del tipo T.
    public void push(T elemento) {
        elementos.add(elemento);
    }

    // El método pop ahora devuelve un elemento del tipo T.
    public T pop() {
        if (isEmpty()) {
            // Es mejor práctica lanzar una excepción que devolver null.
            throw new EmptyStackException();
        }
        return elementos.remove(elementos.size() - 1);
    }

    // El método peek nos permite ver el último elemento sin sacarlo.
    // También devuelve un elemento de tipo T.
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementos.get(elementos.size() - 1);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }
}