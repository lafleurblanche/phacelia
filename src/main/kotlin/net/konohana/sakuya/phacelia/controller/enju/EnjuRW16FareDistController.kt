package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW16FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW16FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW16FareDistコントローラ
 * * 槐谷線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/enjurw16faredist")
class EnjuRW16FareDistController(
    private val enjuRW16FareDistRepository: EnjuRW16FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW16FareDist> {
        return enjuRW16FareDistRepository.findByStaCode(staCode)
    }
}
