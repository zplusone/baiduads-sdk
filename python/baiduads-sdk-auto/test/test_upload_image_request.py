"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.imagemanagement.model.compression_conf import CompressionConf
from baiduads.imagemanagement.model.upload_image_item import UploadImageItem
globals()['CompressionConf'] = CompressionConf
globals()['UploadImageItem'] = UploadImageItem
from baiduads.imagemanagement.model.upload_image_request import UploadImageRequest


class TestUploadImageRequest(unittest.TestCase):
    """UploadImageRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testUploadImageRequest(self):
        """Test UploadImageRequest"""
        # FIXME: construct object with mandatory attributes with example values
        # model = UploadImageRequest()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
