package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW19FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW19FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW19FareDistコントローラ
 * * 瑞堂線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/enjurw19faredist")
class EnjuRW19FareDistController(
    private val enjuRW19FareDistRepository: EnjuRW19FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW19FareDist> {
        return enjuRW19FareDistRepository.findByStaCode(staCode)
    }
}
