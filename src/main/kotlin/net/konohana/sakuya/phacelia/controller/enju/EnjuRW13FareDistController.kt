package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW13FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW13FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW13FareDistコントローラ
 * * 玿谷線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/enjurw13faredist")
class EnjuRW13FareDistController(
    private val enjuRW13FareDistRepository: EnjuRW13FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW13FareDist> {
        return enjuRW13FareDistRepository.findByStaCode(staCode)
    }
}
