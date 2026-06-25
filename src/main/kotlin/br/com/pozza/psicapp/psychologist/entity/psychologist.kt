@Entity
@Table(name = "psychologists")
data class Psychologist(

    @Id
    val id: UUID,

    @Column(name = "firebase_uid")
    val firebaseUid: String,

    val name: String,

    val email: String,

    val specialty: String,

    val active: Boolean,

    @Column(name = "created_at")
    val createdAt: LocalDateTime
)