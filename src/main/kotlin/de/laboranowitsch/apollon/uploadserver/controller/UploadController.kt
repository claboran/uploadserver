package de.laboranowitsch.apollon.uploadserver.controller

import de.laboranowitsch.apollon.uploadserver.loggingutils.LoggingAware
import de.laboranowitsch.apollon.uploadserver.loggingutils.logger
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile

/**
 * Test controller to enable uploads with timeouts
 */
@RestController
class UploadController : LoggingAware {

    @CrossOrigin
    @PostMapping(value = ["/api/files/{waittime}"])
    @ResponseStatus(HttpStatus.OK)
    fun handleFileUpload(
            @RequestParam("file")file: MultipartFile,
            @PathVariable("waittime") waitTime: Long
    ) {
        logger().info("Received request for file: ${file.originalFilename} with timeout: $waitTime ms")
        Thread.sleep(waitTime)
        logger().info("Timeout done for timeout: $waitTime ms...")
    }
}