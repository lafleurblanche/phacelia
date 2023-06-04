package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW05FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW05FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW05FareDistコントローラ
 * * 筮谷線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/enjurw05faredist")
class EnjuRW05FareDistController(
    private val enjuRW05FareDistRepository: EnjuRW05FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW05FareDist> {
        return enjuRW05FareDistRepository.findByStaCode(staCode)
    }
}
