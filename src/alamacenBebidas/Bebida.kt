package alamacenBebidas

data class Bebida(val id: Int, val litros: Double, val precio: Double, val marca: String) {

    fun mostrarBebida() {
        println("ID: $id")
        println("Litros: $litros")
        println("Precio: $precio")
        println("Marca: $marca")
    }

}