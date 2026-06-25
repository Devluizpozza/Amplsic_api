@RestController
@RequestMapping("/psychologists")
class PsychologistController(
    private val service: PsychologistService
) {

    @GetMapping
    fun findAll(): List<Psychologist> {
        return service.findAll()
    }

     @PostMapping
    fun create(
        @RequestBody request: CreatePsychologistRequest
    ): ResponseEntity<PsychologistResponse> {

        val psychologist = psychologistService.create(request)

        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(psychologist.toResponse())
    }
}