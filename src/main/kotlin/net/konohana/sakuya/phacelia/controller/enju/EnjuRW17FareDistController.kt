package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW17FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW17FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW17FareDistコントローラ
 * * 拯川線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/enjurw17faredist")
class EnjuRW17FareDistController(
    private val enjuRW17FareDistRepository: EnjuRW17FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW17FareDist> {
        return enjuRW17FareDistRepository.findByStaCode(staCode)
    }
}
