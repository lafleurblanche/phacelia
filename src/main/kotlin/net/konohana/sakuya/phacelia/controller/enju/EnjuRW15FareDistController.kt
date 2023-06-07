package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW15FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW15FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW15FareDistコントローラ
 * * 荍谷線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/enjurw15faredist")
class EnjuRW15FareDistController(
    private val enjuRW15FareDistRepository: EnjuRW15FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW15FareDist> {
        return enjuRW15FareDistRepository.findByStaCode(staCode)
    }
}
