class SpeedMonitorImpl(private val notifier: NotificationService) : SpeedMonitor {
    override fun checkSpeed(rental: Rental, currentSpeed: Int) {
        if (currentSpeed > rental.maxSpeedLimit) {
            notifier.notifyCompany(rental, currentSpeed)
            notifier.alertUser(rental, currentSpeed)
        } else {
        }
    }
}