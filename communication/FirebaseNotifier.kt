class FirebaseNotifier : NotificationService {
    override fun notifyCompany(rental: Rental, currentSpeed: Int) {
        println("Firebase: Company notified about speed ${'$'}currentSpeed km/h for rental ${'$'}{rental.rentalId}")
    }

    override fun alertUser(rental: Rental, currentSpeed: Int) {
        println("Firebase: User alerted - speed ${'$'}currentSpeed km/h exceeded limit of ${'$'}{rental.maxSpeedLimit}")
    }
}