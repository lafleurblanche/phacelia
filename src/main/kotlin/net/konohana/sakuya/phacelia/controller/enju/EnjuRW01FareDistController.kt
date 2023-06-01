package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW01FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW01FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW01FareDistコントローラ
 * * 苆谷線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/enjurw01faredist")
class EnjuRW01FareDistController(
    private val enjuRW01FareDistRepository: EnjuRW01FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW01FareDist> {
        return enjuRW01FareDistRepository.findByStaCode(staCode)
    }
}
