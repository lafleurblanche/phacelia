package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW12FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW12FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW12FareDistコントローラ
 * @author lafleurblanche
 */
@Controller("/enjurw12faredist")
class EnjuRW12FareDistController(
    private val enjuRW12FareDistRepository: EnjuRW12FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW12FareDist> {
        return enjuRW12FareDistRepository.findByStaCode(staCode)
    }
}
