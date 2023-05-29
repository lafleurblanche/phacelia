package net.konohana.sakuya.phacelia.application.argw

import io.micronaut.http.HttpStatus
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.http.client.exceptions.HttpClientResponseException
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import net.konohana.sakuya.phacelia.models.argw.AreaGW01FareDist
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

@MicronautTest(transactional = false)
class AreaGW01FareDistControllerTest(@Client("/") val client: HttpClient) {
    @Test
    fun testFindNonExistingStaCodeReturn404() {
        val thrown = assertThrows<HttpClientResponseException> {
            client.toBlocking().exchange<Any>("/areagw01faredist/GW9999")
        }

        assertNotNull(thrown.response)
        assertEquals(HttpStatus.NOT_FOUND, thrown.status)
    }

    @Test
    fun testAreaGWEExistingStaCode() {
        val faredist = client.toBlocking().retrieve("/areagw01faredist/GW0101", AreaGW01FareDist::class.java)
        assertEquals("GW0101", faredist.staCode)
    }

}
