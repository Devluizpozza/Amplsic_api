@Service
class PsychologistService(
    private val repository: PsychologistRepository
) {

    fun findAll(): List<Psychologist> {
        return repository.findAll()
    }
}