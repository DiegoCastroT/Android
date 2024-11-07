package alamacenBebidas

/**
 * AlmacenBebidas represents a storage of drinks.
 * @property estanteria is a 5x5 matrix of drinks.
 */
class AlmacenBebidas {
    private val estanteria: Array<Array<Bebida?>> = Array(5) { Array(5) { null } }


    fun addBebida(bebida: Bebida): Boolean {
        if (isId(bebida)) {
            return false
        }

        for (fila in 0..<5) {
            for (columna in 0..<5) {
                if (estanteria[fila][columna] == null) {
                    estanteria[fila][columna] = bebida
                    return true
                }
            }
        }
        return false
    }

    fun removeBebida(bebida: Bebida) {

    }

    fun mostrarBebida(bebida: Bebida) {
        println(bebida.mostrarInformacion())
    }

    fun mostrarPrecioTotal(bebida: Bebida) {
        //mostrar total de precio de la bebida
    }

    fun mostrarPrecioTotalMarca(marca: String) {
        //mostrar total de precio de la bebida por marca
    }

    fun mostrarPrecioTotalColumna(columna: Int) {
        //mostrar total de precio de la bebida por columna
    }

    private fun isId(bebida: Bebida): Boolean {
        for (fila in 0..5) {
            for (columna in 0..5) {
                if (estanteria[fila][columna]?.id == bebida.id) {
                    return true
                }
            }
        }
        return false
    }

    private fun getIndex(bebida: Bebida): Pair<Int, Int>? {
        for (fila in 0 .. 5) {
            for (columna in 0 .. 5) {
                if (estanteria[fila][columna]?.id == bebida.id) {
                    return Pair(fila, columna)
                }
            }
        }
        return null
    }

}