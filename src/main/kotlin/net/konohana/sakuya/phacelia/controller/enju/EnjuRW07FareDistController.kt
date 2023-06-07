package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW07FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW07FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW07FareDistコントローラ
 * * 筥谷線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/enjurw07faredist")
class EnjuRW07FareDistController(
    private val enjuRW07FareDistRepository: EnjuRW07FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW07FareDist> {
        return enjuRW07FareDistRepository.findByStaCode(staCode)
    }
}
