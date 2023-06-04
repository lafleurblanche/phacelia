package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW04FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW04FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW04FareDistコントローラ
 * * 筏谷線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/enjurw04faredist")
class EnjuRW04FareDistController(
    private val enjuRW04FareDistRepository: EnjuRW04FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW04FareDist> {
        return enjuRW04FareDistRepository.findByStaCode(staCode)
    }
}
