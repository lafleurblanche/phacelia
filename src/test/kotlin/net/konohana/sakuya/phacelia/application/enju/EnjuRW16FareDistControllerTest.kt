package net.konohana.sakuya.phacelia.application.enju

import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.http.client.exceptions.HttpClientResponseException
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import net.konohana.sakuya.phacelia.constant.ClientUrl
import net.konohana.sakuya.phacelia.models.enju.EnjuRW16FareDist
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@MicronautTest(transactional = false)
class EnjuRW16FareDistControllerTest(@Client("/") val client: HttpClient) {
    @Test
    fun testFindNonExistingStaCodeReturn404() {
        val thrown = assertThrows<HttpClientResponseException> {
            client.toBlocking().exchange<Any>(ClientUrl.CLIENT_URL_ENJURW16_NOT_EXIST)
        }

        Assertions.assertNotNull(thrown.response)
        Assertions.assertEquals(HttpStatus.NOT_FOUND, thrown.status)
    }

    @Test
    fun testEnjuRWEExistingStaCode() {
        val faredist = client.toBlocking().retrieve(ClientUrl.CLIENT_URL_ENJURW16_EXIST, EnjuRW16FareDist::class.java)
        Assertions.assertEquals("RW1601", faredist.staCode)
    }

}
