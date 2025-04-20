class AwsNotifier : NotificationService {
    override fun notifyCompany(rental: Rental, currentSpeed: Int) {
        println("AWS: Company notified")
    }

    override fun alertUser(rental: Rental, currentSpeed: Int) {
        println("AWS: User warned")
    }
}