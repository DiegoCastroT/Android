package alamacenBebidas

data class AlmacenBebidas(val estanteria: Array<Array<Bebida?>> = Array(5) { Array(5) { null } })


fun addBebida(bebida: Bebida) {

}

fun removeBebida(bebida: Bebida) {

}

fun mostrarBebida(bebida: Bebida) {
    println(bebida.mostrarBebida())
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


