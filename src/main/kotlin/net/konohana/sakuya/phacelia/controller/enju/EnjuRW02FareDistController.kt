package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW02FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW02FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW02FareDistコントローラ
 * * 茄谷線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/enjurw02faredist")
class EnjuRW02FareDistController(
    private val enjuRW02FareDistRepository: EnjuRW02FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW02FareDist> {
        return enjuRW02FareDistRepository.findByStaCode(staCode)
    }
}
