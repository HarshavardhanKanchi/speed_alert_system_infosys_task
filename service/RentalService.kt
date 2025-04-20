class RentalService(
    private val speedMonitor: SpeedMonitor
) {
    fun updateSpeed(rental: Rental, speed: Int) {
        speedMonitor.checkSpeed(rental, speed)
    }
}