package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW14FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW14FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW14FareDistコントローラ
 * * 珮谷線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/enjurw14faredist")
class EnjuRW14FareDistController(
    private val enjuRW14FareDistRepository: EnjuRW14FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW14FareDist> {
        return enjuRW14FareDistRepository.findByStaCode(staCode)
    }
}
