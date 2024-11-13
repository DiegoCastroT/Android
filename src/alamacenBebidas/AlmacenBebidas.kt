package alamacenBebidas

/**
 * AlmacenBebidas represents a storage of drinks.
 * @property estanteria is a 5x5 matrix of drinks.
 */
class AlmacenBebidas {
    private val estanteria: Array<Array<Bebida?>> = Array(5) { Array(5) { null } }


    fun addBebida(bebida: Bebida): Boolean {

        for (fila in 0..4) {
            for (columna in 0..4) {
                if (estanteria[fila][columna] == null) {
                    estanteria[fila][columna] = bebida
                    return true
                }
            }
        }
        return false
    }

    fun removeBebida(id:Int): Boolean {

        for(fila in 0..4){
            for (columna in 0..4){
                if(estanteria[fila][columna]?.id == id){
                    estanteria[fila][columna] = null
                    return true
                }
            }
        }
        return false
    }

    fun mostrarBebida() {

        for (fila in 0..4) {
            for (columna in 0..4) {
                if (estanteria[fila][columna] != null) {
                    println(estanteria[fila][columna]!!.mostrarInformacion())
                }
            }
        }

    }

    fun mostrarPrecioTotal(): Double {

        var total = 0.0
        for(fila in 0..4){
            for (columna in 0..4){
                if(estanteria[fila][columna] != null){
                    total += estanteria[fila][columna]!!.calcularPrecio()
                }
            }
        }
        return total
    }

    fun mostrarPrecioTotalMarca(marca: String) : Double {
        var total = 0.0

        for(fila in 0..4){
            for (columna in 0..4){
                if(estanteria[fila][columna]?.marca != null && estanteria[fila][columna]?.marca == marca){
                    total += estanteria[fila][columna]!!.calcularPrecio()
                }
            }
        }
        return total
    }

    fun mostrarPrecioTotalColumna(columna: Int): Double {

        if(columna < 0 || columna > 4){
            return 0.0
        }

        var total = 0.0
        for (fila in 0..4) {
            if(estanteria[fila][columna] != null){
                total += estanteria[fila][columna]!!.calcularPrecio()
            }
        }

        return total
    }





}