"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.advancedsegment.model.batch_request import BatchRequest
from baiduads.common.model.api_request_header import ApiRequestHeader
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['BatchRequest'] = BatchRequest
from baiduads.advancedsegment.model.delete_segment_request_wrapper import DeleteSegmentRequestWrapper


class TestDeleteSegmentRequestWrapper(unittest.TestCase):
    """DeleteSegmentRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testDeleteSegmentRequestWrapper(self):
        """Test DeleteSegmentRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = DeleteSegmentRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
