package hw_09042021.enum_letter;

public enum Letter {
    A, B, C, D, E, F,
    G, H, I, J, K, L,
    M, N, O, P, Q, R,
    S, T, U, V, W, X,
    Y, Z;

    int getLetterPosition() {
        return ordinal() + 1;
    }
}
