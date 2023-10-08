package id.walt.ssikit.did.registrar.local.cheqd.models.job.response

import id.walt.ssikit.did.registrar.local.cheqd.models.job.didstates.DidState
import kotlinx.serialization.Serializable

@Serializable
data class JobActionResponse(
    val didState: DidState,
    val jobId: String
)
