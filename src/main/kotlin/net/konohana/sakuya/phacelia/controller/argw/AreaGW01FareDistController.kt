package net.konohana.sakuya.phacelia.controller.argw

import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Error
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.hateoas.JsonError
import net.konohana.sakuya.phacelia.models.argw.AreaGW01FareDist
import net.konohana.sakuya.phacelia.repositories.argw.AreaGW01FareDistRepository
import reactor.core.publisher.Mono

/**
 * ## AreaGW01FareDistコントローラ
 * * 支線連絡系統梼谷線営業キロ情報
 * @author lafleurblanche
 */
@Controller("/areagw01faredist")
class AreaGW01FareDistController(
    private val areaGW01FareDistRepository: AreaGW01FareDistRepository
) {
    /**
     * 駅名コードから距離情報を取得します.
     * @param staCode 駅名コード
     * @return 距離情報
     */
    @Get("/{staCode}")
    fun findByStaCode(@PathVariable staCode: String): Mono<AreaGW01FareDist> {
        return areaGW01FareDistRepository.findByStaCode(staCode)
    }

    @Error(status = HttpStatus.NOT_FOUND, global = true)
    fun notFoundHandler(request: HttpRequest<*>): HttpResponse<JsonError> {
        return HttpResponse
            .status<JsonError>(HttpStatus.NOT_FOUND)
            .body(JsonError(" '$request' Not Found"))
    }
}
