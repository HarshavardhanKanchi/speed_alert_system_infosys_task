interface NotificationService {
    fun notifyCompany(rental: Rental, currentSpeed: Int)
    fun alertUser(rental: Rental, currentSpeed: Int)
}