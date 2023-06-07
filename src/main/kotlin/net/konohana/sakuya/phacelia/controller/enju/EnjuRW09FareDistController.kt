package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW09FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW09FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW09FareDistコントローラ
 * * 箬谷線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/enjurw09faredist")
class EnjuRW09FareDistController(
    private val enjuRW09FareDistRepository: EnjuRW09FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW09FareDist> {
        return enjuRW09FareDistRepository.findByStaCode(staCode)
    }
}
