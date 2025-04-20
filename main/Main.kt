fun main() {
    val user = User("user1", "Harsha")
    val car = Car("Car1", "Honda Model 3")
    val rental = Rental("R001", user, car, maxSpeedLimit = 100)

    val firebaseNotifier = FirebaseNotifier()
    val speedMonitor = SpeedMonitorImpl(firebaseNotifier)
    val rentalService = RentalService(speedMnitor)

    rentalService.updateSpeed(rental, speed = 110)
}