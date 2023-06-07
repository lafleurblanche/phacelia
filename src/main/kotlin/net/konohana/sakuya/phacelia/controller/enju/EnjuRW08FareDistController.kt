package net.konohana.sakuya.phacelia.controller.enju

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import net.konohana.sakuya.phacelia.models.enju.EnjuRW08FareDist
import net.konohana.sakuya.phacelia.repositories.enju.EnjuRW08FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## EnjuRW08FareDistコントローラ
 * * 笒谷線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/enjurw08faredist")
class EnjuRW08FareDistController(
    private val enjuRW08FareDistRepository: EnjuRW08FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<EnjuRW08FareDist> {
        return enjuRW08FareDistRepository.findByStaCode(staCode)
    }
}
