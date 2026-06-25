@Entity
@Table(name = "psychologists")
data class Psychologist(

    @Id
    val id: UUID,

    @Column(name = "firebase_uid")
    val firebaseUid: String,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false, unique = true)
    val email: String,

    @Column(nullable = false, unique = true)
    val specialty: String,

    val active: Boolean,

    @CreationTimestamp
    @Column(name = "created_at")
    val createdAt: LocalDateTime
)