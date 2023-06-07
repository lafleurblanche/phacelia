package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW10FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW10FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW10FareDistコントローラ
 * * 苕谷線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/enjurw10faredist")
class EnjuRW10FareDistController(
    private val enjuRW10FareDistRepository: EnjuRW10FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW10FareDist> {
        return enjuRW10FareDistRepository.findByStaCode(staCode)
    }
}
