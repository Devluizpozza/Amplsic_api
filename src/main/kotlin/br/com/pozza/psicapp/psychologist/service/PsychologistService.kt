@Service
class PsychologistService(
    private val repository: PsychologistRepository
) {

    fun findAll(): List<Psychologist> {
        return repository.findAll()
    }

    fun create(request: CreatePsychologistRequest): Psychologist {

    val psychologist = Psychologist(
        name = request.name,
        email = request.email,
        crp = request.crp
    )

    return repository.save(psychologist)
}

fun Psychologist.toResponse() = PsychologistResponse(
    id = id!!,
    name = name,
    email = email,
    crp = crp,
    createdAt = createdAt
)
}