import alamacenBebidas.AguaMineral
import alamacenBebidas.AlmacenBebidas
import alamacenBebidas.BebidaAzucarada
import java.util.Scanner

val scanner = Scanner(System.`in`)
val almacenBebidas = AlmacenBebidas()
fun main() {

    var continuar = true

    while (continuar) {
        println("Escoge qué hacer:")
        println("1. Añadir bebida")
        println("2. Eliminar bebida")
        println("3. Calcular precio de todas las bebidas")
        println("4. Calcular el precio total de una marca de bebida")
        println("5. Calcular el precio total de una columna de la estantería del almacén")
        println("6. Mostrar bebidas:")
        println("7. Salir")

        when (scanner.nextInt()) {
            1 -> addBebida()
            2 -> removeBebida()
            3 -> showTotalPrice()
            4 -> showPriceByBrand()
            5 -> showPriceByColumn()
            6 -> showDrinks()
            7 -> {
                println("¿Deseas salir? Escribe 'false' para terminar o 'true' para continuar.")
                continuar = scanner.nextBoolean()
            }
            else -> println("Dato incorrecto")
        }
    }

}

fun addBebida() {
    println("Vamos a crear una bebida")
    println("1. Agua Mineral ")
    println("2. Bebida azucarada")

    val option = scanner.nextInt()

    if (option == 1) {

        val aguaMineral = addMineralWater()

        println("Bebida creada correctamente")

        if(almacenBebidas.addBebida(aguaMineral)){
            println("Bebida añadida correctamente")
        } else {
            println("Error al añadir la bebida")
        }

    } else if (option == 2) {

        val bebidaAzucarada = addSugarDring()

        println("Bebida creada correctamente")

        if(almacenBebidas.addBebida(bebidaAzucarada)){
            println("Bebida añadida correctamente")
        } else {
            println("Error al añadir la bebida")
        }

    } else {
        println("Opción incorrecta")
    }

}

fun removeBebida(){
    println("Dame el id de la bebida que quieres eliminar")
    val id = scanner.nextInt()

    if(almacenBebidas.removeBebida(id)){
        println("Bebida eliminada correctamente")
    } else {
        println("Error al eliminar la bebida")
    }

}

fun showTotalPrice(){
    println(almacenBebidas.mostrarPrecioTotal())
}

fun showPriceByBrand(){
    println("Dame la marca de la bebida")
    val marca = scanner.next()

    println(almacenBebidas.mostrarPrecioTotalMarca(marca))
}

fun showPriceByColumn(){
    println("Dame la columna de la estantería")
    val columna = scanner.nextInt()

    println(almacenBebidas.mostrarPrecioTotalColumna(columna))
}

fun showDrinks(){
    almacenBebidas.mostrarBebida()
}

fun addMineralWater(): AguaMineral {
    println("Vamos a crear agua mineral")
    println("Dame el id")

    var id = scanner.nextInt()

    while (almacenBebidas.checkId(id)) {
        println("El ID ya existe. Introduce un ID único.")
        id = scanner.nextInt()
    }

    println("Dame los litros")
    val litros = scanner.nextDouble()
    println("Dame el precio")
    val precio = scanner.nextDouble()
    println("Dame la marca")
    val marca = scanner.next()
    println("Dame el manantial")
    val manantial = scanner.next()

    val aguaMineral = AguaMineral(id, litros, precio, marca, manantial)

    return aguaMineral
}

fun addSugarDring(): BebidaAzucarada{

    println("Vamos a crear una bebida azucarada")

    println("Dame el id")

    var id = scanner.nextInt()

    while (almacenBebidas.checkId(id)) {
        println("El ID ya existe. Introduce un ID único.")
        id = scanner.nextInt()
    }

    println("Dame los litros")
    val litros = scanner.nextDouble()
    println("Dame el precio")
    val precio = scanner.nextDouble()
    println("Dame la marca")
    val marca = scanner.next()
    println("Dame el porcentaje de azúcar")
    val porcentajeAzucar = scanner.nextDouble()
    println("Dame si tiene promoción")
    val tienePromocion = scanner.nextBoolean()

    val bebidaAzucarada = BebidaAzucarada(id, litros, precio, marca, porcentajeAzucar, tienePromocion)
    return bebidaAzucarada
}