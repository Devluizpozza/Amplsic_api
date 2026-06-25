@RestController
@RequestMapping("/psychologists")
class PsychologistController(
    private val service: PsychologistService
) {

    @GetMapping
    fun findAll(): List<Psychologist> {
        return service.findAll()
    }
}