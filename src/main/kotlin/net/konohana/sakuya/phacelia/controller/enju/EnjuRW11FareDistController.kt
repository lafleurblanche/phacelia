package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW11FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW11FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW11FareDistコントローラ
 * @author lafleurblanche
 */
@Controller("/enjurw11faredist")
class EnjuRW11FareDistController(
    private val enjuRW11FareDistRepository: EnjuRW11FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW11FareDist> {
        return enjuRW11FareDistRepository.findByStaCode(staCode)
    }
}
