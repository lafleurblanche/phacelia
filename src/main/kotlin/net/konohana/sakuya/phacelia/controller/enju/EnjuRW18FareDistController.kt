package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW18FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW18FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW18FareDistコントローラ
 * * 卯塚線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/enjurw18faredist")
class EnjuRW18FareDistController(
    private val enjuRW18FareDistRepository: EnjuRW18FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW18FareDist> {
        return enjuRW18FareDistRepository.findByStaCode(staCode)
    }
}
